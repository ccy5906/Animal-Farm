
public class detail implements Runnable {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 50; i <= 70; i++) {
				gameroom.feelBar.setValue(i);
				gameroom.feelBar.repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // catch
			} // for
		}// run
		

}// class detail
