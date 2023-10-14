public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        CWorker objWork1 = new CWorker("호준");

        Thread th1 = new Thread((/*이름 없는 함수 파라미터 던저준다는데 그게 뭔 소린지 모르겠음*/) -> {
            while(objWork1.mArrJobs.size() < objWork1.MAXJOBCNT) {
                objWork1.mWork();
//                objWork1.mShow();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        th1.setName("thread호준");
        th1.start();

        //-----------------------------호준 null--------------------------------

        CWorker objWork2 = new CWorker("호준null");

        Thread th2 = new Thread(() -> {
            while(objWork2.mArrJobs.size() < objWork2.MAXJOBCNT) {
                objWork2.mWork();
//                objWork2.mShow();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        th2.setName("thread호준null");
        th2.start();
        //-----------------------------호준 none--------------------------------

        CWorker objWork3 = new CWorker("호준none");

        Thread th3 = new Thread(() -> {
            while(objWork2.mArrJobs.size() < objWork3.MAXJOBCNT) {
                objWork3.mWork();
//                objWork3.mShow();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        th3.setName("thread호준none");
        th3.start();

        //-----------------------------스레드 monitor--------------------------------

        Thread thMonitor = new Thread(() -> {
            while (th1.isAlive() || th2.isAlive() || th3.isAlive()) {
                System.out.println("---------------------------------");
                objWork1.mShow();
                objWork2.mShow();
                objWork3.mShow();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thMonitor.setName("모니터스레드");
        thMonitor.start();

    }

}