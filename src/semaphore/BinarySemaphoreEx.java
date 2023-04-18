package semaphore;
import java.util.*;

import static semaphore.Value.ONE;
import static semaphore.Value.ZERO;

public class BinarySemaphoreEx {

    class BinarySemaphore {
        Value value;
        Queue<Pid> queue;
    }

    class Pid {
        public Pid() {}
    }

    void semWaitB(BinarySemaphore s) {
        if (s.value == ONE) s.value = ZERO;
        else {
            /* 요청한 프로세스를 s.queue에 연결  */
            /* 요청한 프로세스를 블록 상태로 전이 */
        }
    }

    void semSignalB(BinarySemaphore s) {
        if (s.queue.isEmpty()) s.value = ONE;
        else {
            /* s.queue에서 프로세스 p를 제거  */
            /* 프로세스의 p의 상태를 실행 가능으로 전이, ready list에 연결 */
        }
    }
}
