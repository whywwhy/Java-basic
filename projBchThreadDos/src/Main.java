public class Main {
    public static void main(String[] args) {
        CWorker objWork1 = new CWorker("호준");

        Thread th1 = new Thread(()->{
            while(objWork1.mArrJobs.size()< objWork1.MAXJOBCNT) {
                objWork1.mWork();
                objWork1.mShow();

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th1.setName("thread호준");
        th1.start();
    }
}