package oop.inter.practice;

public class Main {
    public static void main(String[] args) {

        MediaPlayer player = new MediaPlayer();
        player.addMedia(new VideoPlayer());
        player.addMedia(new AudioPlayer());
        player.addMedia(new ImageDisplay());

        player.playAll();  // 모든 미디어 파일 재생 (각각의 play메서드 호출)

        /*
        문제: 멀티미디어 파일 플레이어 시스템
배경
멀티미디어 애플리케이션에서는 다양한 형식의 미디어 파일을 재생할 수 있어야 합니다. 이 시스템에서는 비디오, 오디오 및 이미지 파일을 처리하기 위한 인터페이스를 정의하고, 각 파일 형식에 대한 플레이어 기능을 구현합니다.

요구사항
인터페이스 MediaPlayable 정의

메소드:
play(): 미디어 파일을 재생하는 메소드.
pause(): 미디어 재생을 일시 정지하는 메소드.
stop(): 미디어 재생을 중지하는 메소드.
서브 클래스 구현

VideoPlayer, AudioPlayer, ImageDisplay 등의 클래스를 MediaPlayable 인터페이스의 구현체로 만듭니다.
각 클래스는 play, pause, stop 메소드를 자신의 미디어 유형에 맞게 구현합니다.
미디어 관리 클래스 MediaPlayer 생성

속성:
mediaList: MediaPlayable 객체들을 관리하는 MediaPlayable[].
메소드:
addMedia(MediaPlayable media): 미디어 목록에 미디어를 추가합니다.
playAll(): 목록에 있는 모든 미디어 파일을 재생합니다.
구현할 사항
MediaPlayable 인터페이스와 여러 미디어 플레이어 클래스를 구현합니다.
MediaPlayer 클래스에서 미디어 파일을 관리하고 통합된 조작을 수행합니다.
Main 클래스에서 여러 미디어 파일을 추가하고 통합된 조작을 테스트합니다.
         */
    }
}
