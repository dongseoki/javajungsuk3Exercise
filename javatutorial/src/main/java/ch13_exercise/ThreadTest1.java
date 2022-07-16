package ch13_exercise;

import javax.swing.*;

// 예제 연습 1-9
public class ThreadTest1 {
    public static void main(String[] args) {
        // soundGroup soundThread : create, and run
        
        // screenGroup screanTread : create, and run
        
        // 사용자 입력을 위한 화면 명시
        
        // 입력이 끝났다면, 입력값 출력하고,
        // sound랑 screen Thread 멈추기!!
        
        ThreadGroup soundGroup = new ThreadGroup("SoundGroup");
        ThreadGroup screenGroup = new ThreadGroup("ScreenGroup");
        SoundThread soundThreadRunnable = new SoundThread();
        Thread soundThread = new Thread(soundGroup,soundThreadRunnable , "SoundThread!");
        ScreenThread screenThreadRunnable = new ScreenThread();
        Thread screenThread = new Thread(screenGroup, screenThreadRunnable, "ScreenThread");
        soundThread.start();
        screenThread.start();

        String input = JOptionPane.showInputDialog("하고 싶은 말을 입력하세요.");
        System.out.println("input = " + input);

        soundThread.stop();
        screenThread.stop();

    }


}
class SoundThread implements  Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("까톡까톡 알람!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ScreenThread implements  Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("랜더링! 화면 출력");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}