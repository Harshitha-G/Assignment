/**
 * Created by harshitha.g on 7/18/2017.
 */
public class HelloWorld
{
    private String name="harshitha";
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getMessage ()
    {
        if (name == "")
            return "hello";
        else
            return "hello " + name + "!";
    }

}
