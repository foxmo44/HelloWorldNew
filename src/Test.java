/**
 * Created by foxmo on 7/16/2016.
 */
public class Test
{
    private Person objPersons;

    public void Run()
    {
        objPersons = new Person();

        objPersons.strName = "Ted";
        objPersons.iAge = 35;

        //aPersons[2].strName = "Fred";
        //aPersons[2].iAge = 9;

        //Actually write the string to the console
        System.out.println("Hello World");
        System.out.println("--------------");
        System.out.println("Name = " + objPersons.strName);
        System.out.println("Age = " + objPersons.iAge);
        System.out.println("--------------");
    }
}
