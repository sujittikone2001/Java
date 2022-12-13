import java.awt.*;

class GUI2
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("title");
    }
}

class MarvellousFrame
{
   public MarvellousFrame(String title)
   {
      Frame fobj = new Frame("Marvellous PPA41");
      fobj.setSize(500,500);
      fobj.setVisible(true);
   }
}
