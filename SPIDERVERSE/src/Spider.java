public class Spider extends SpiderV implements SpiderCallbacks{

    public Spider(String name) {
        super( name);
    }

    @Override
    public void Telaraña(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        System.out.println("Telarana "+getName());
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void Salto(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        System.out.println("Salto "+getName());
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void Golpe(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        System.out.println("Golpe "+getName());
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void Patada(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        System.out.println("Patada "+getName());
        s.setBounds(200,100,1100,900);
    }


}
