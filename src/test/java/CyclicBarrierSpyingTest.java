import java.util.concurrent.CyclicBarrier;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CyclicBarrierSpyingTest {

	@Test
	void reproduce() throws Exception {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(1);
		cyclicBarrier.await(); // works fine

		CyclicBarrier spy = Mockito.spy(cyclicBarrier);
		spy.await(); //throws java.lang.NullPointerException: Cannot invoke "java.util.concurrent.locks.ReentrantLock.lock()" because "lock" is null
	}

}
