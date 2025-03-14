class TestThread {
    public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();

		System.out.println("Hello from main thread");
	}
}

class MyThread extends Thread {
    public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// Обработка прерывания
				System.out.println("Поток был прерван: " + e.getMessage());
				Thread.currentThread().interrupt(); // Восстановление флага прерывания
			}
			System.out.println("Hello from MyThread");
		}
	}
}

