public class Game {
    public static void main(String[] args) throws InterruptedException {
       TestSpider();
    }

    private static void TestSpider() throws InterruptedException{
        Screen screen = new Screen();
        Spider SpiderPP = new Spider("PETER PARKER");
        Spider SpiderMM = new Spider("MILES MORALES");
        Spider SpiderGS = new Spider("GWEN STACY");

      Runnable attack = new Runnable() {
          @Override
          public void run() {

              try {
                    SpiderPP.Telaraña(screen);
                    Thread.sleep(3000);

                    SpiderPP.Salto(screen);
                    Thread.sleep(3000);

                    SpiderPP.Golpe(screen);
                    Thread.sleep(3000);

                    SpiderPP.Patada(screen);
                    Thread.sleep(3000);

                    SpiderMM.Telaraña(screen);
                    Thread.sleep(3000);

                    SpiderMM.Salto(screen);
                    Thread.sleep(3000);

                    SpiderMM.Golpe(screen);
                    Thread.sleep(3000);

                    SpiderMM.Patada(screen);
                    Thread.sleep(3000);

                    SpiderGS.Telaraña(screen);
                    Thread.sleep(3000);

                    SpiderGS.Salto(screen);
                    Thread.sleep(3000);

                    SpiderGS.Golpe(screen);
                    Thread.sleep(3000);

                    SpiderGS.Patada(screen);
                    Thread.sleep(3000);

              }catch (InterruptedException ie){
                  ie.printStackTrace();
              }
          }
      };

      Thread attackSpiderPP = new Thread(attack);
      attackSpiderPP.start();


    }
}
