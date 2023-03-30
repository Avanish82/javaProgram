//Interface iA{ void fn(int x);}
//Interface iB{ void fn();}
//Interface iC{ void fn(int x, int y);}
//Interface iD{ int fn(int x, int y);}
//
// 
//
//iA a1=(int x) -> sysout(x);
//iA a2=(x) -> sysout(x);
//iA a3= x ->sysout(x);
//iA a4 = x -> {sysout(x);sysout(x*x); };
//
// 
//
//iB b1=() -> sysout(Hello);
//iB b1=() -> {sysout(Hello);sysout(Hello again); };
//
// 
//
//iC c1=(int x, int y) -> sysout(x+y);
//iC c2=(x, y) -> sysout(x+y);
//
// 
//
//iD d1=(x,y) -> x+y;
//iD d2=(x,y) -> {return x+y;};