package semaphore;
import java.util.*;

public class GeneralSemaphoreEx {

    class GeneralSemaphore {
        int count;
        Queue<Pid> queue;
    }

    class Pid {
        public Pid() {}
    }


    void semWait(GeneralSemaphore s) {
        s.count--;
        if (s.count < 0) {
            /* 요청한 프로세스를 s.queue에 연결 */
            /* 요청한 프로세스를 블록 상태로 전이시킴 */
        }
    }

    void semSignal(GeneralSemaphore s) {
        s.count++;

        if (s.count <= 0) {
            /* s.queue에 연결되어 있는 프로세스를 큐에서 제거 */
            /* 프로세스 상태를 실행 가능으로 전이시키고 redy list에 연결 */
        }
    }
}
