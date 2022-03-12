class A{
    int x= 2;
    int y;
}
class B extends A{
    int z;
    int x = 1;
}
class C extends B{
    int x;
    int a;
    C(int x){
        this.x  = x * x;
        a = this.x + x + super.x + ((A)this).x;
        System.out.println("A is "+a);
    }
}
class ISA{
    public static void main(String[] args) {
        C c = new C(3);
    }
}