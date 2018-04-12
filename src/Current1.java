public class Current1 implements Runnable {

    @Override
    public void run() {
        
        boolean t = true;
        while(true){
            try {

                System.out.println("Beginning 1\n");
                Main.arm1 = Battle.play(Main.arm1, Main.arm1);
                if( Main.arm1.size() == 0 ){
                    System.out.println("Win 1");
                    break;
                }
                System.out.println("Finis 1\n");
                Thread.sleep(1000);
                System.out.println("Beginning 2\n");
                Main.arm1 = Battle.play(Main.arm1, Main.arm1);
                if( Main.arm1.size() == 0 ){
                    System.out.println("Win 2");
                    break;
                }
                System.out.println("Finish2\n");
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
