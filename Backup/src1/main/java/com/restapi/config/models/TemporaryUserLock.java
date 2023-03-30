package com.icicihfc.services.security.models;

import com.icicihfc.services.utils.CommonUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author rajatjain on 13/06/20.
 * @project hfcservices
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "temp_user_lock")
@SequenceGenerator(name = "security_seq_gen", sequenceName = "security_seq", allocationSize = 1)
public class TemporaryUserLock {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "security_seq_gen")
    private Long id;

    private Long oauthUserId;

    private Timestamp lastFailDate;

    private Integer count;

    public TemporaryUserLock(Long oauthUserId, Timestamp lastFailDate, Integer count) {
        this.count = count;
        this.lastFailDate = lastFailDate;
        this.oauthUserId = oauthUserId;
    }

    public void incrementCount(){
        this.lastFailDate = CommonUtils.getCurrentTimeStamp();
        this.count = count+1;
    }

    public void resetCounter(){
        this.lastFailDate = CommonUtils.getCurrentTimeStamp();
        this.count = 1;
    }

    public static TemporaryUserLockBuilder builder(){
        return new TemporaryUserLockBuilder();
    }

    public static class TemporaryUserLockBuilder{

        private Long oauthUserId;

        private final Timestamp lastFailDate = CommonUtils.getCurrentTimeStamp();

        private Integer count = 1;

        public TemporaryUserLockBuilder withOAuthUser(OAuthUser oAuthUser){
            this.oauthUserId = oAuthUser.getId();
            return this;
        }

        public TemporaryUserLockBuilder withCount(int count){
            this.count = count;
            return this;
        }

        public TemporaryUserLock build(){
            return new TemporaryUserLock(oauthUserId, lastFailDate, count);
        }
    }

}
