package latihan1;
class Pertama {
    private int a = 10;
    
    protected void terprotek ()
    {
        System.out.println("Method ini hanya untuk anaknya");
    }
    
    public void info ()
    {
        System.out.println("a =" +a);
        System.out.println("Dipanggiil pada = "+this.getClass () .getName());
    }    
}