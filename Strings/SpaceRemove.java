public class SpaceRemove {
    public static void main(String[] args) {
        String str="hello i am Srikanta";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            System.out.print(str.charAt(i));
        }
    }
}
