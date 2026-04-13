class You
{
private int an;
private int pw;
You(){
an =111;
pw=222;
}
}
class Friend extends You
{
void changeData()
{
an =8888;
pw=9999;
}
}
class Launch
{
public static void main(String args[])
{
Friend f = new Friend();
f.changeData();
//f.disp();
}
}