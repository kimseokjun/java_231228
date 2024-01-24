package n_Chapter13;

import java.util.ArrayList;
import java.util.LinkedList;

// 이벤트 관리 시스템

//이벤트 참가자 명단 관리
// : 사전에 등록, 이벤트 당일에는 추가적인 참가자 등록 X
// ArrayList( 목록추가, 삭제 X / 참가자 조회 O )

// 대기열 관리
// 이벤트에는 한정된 좌석이 있어 , 좌석이 모두 차면 추가로 도착하는 참가자들은
// : 대기열에 등록
// : 위의 이벤트 참가들이 퇴장하는 경우 입장 가능
// Linked

class EventManagement{
	
	ArrayList<String> participantList = new ArrayList<String>();
	LinkedList<String> waitingQueue = new LinkedList<String>();
	void addParticipant(String name) {
		participantList.add(name);
	}
	void addToWaitingQueue(String name) {
		waitingQueue.add(name);
	}
	void leaveParticipant(String name) {
		if(waitingQueue.size() > 0) {
			String nextParticipant =  waitingQueue.remove(0);
			addParticipant(nextParticipant);
		}
	}
	
	boolean checkParticipant(String name) {
		return participantList.contains(name);
	}
}
public class D_ListPractice {

	public static void main(String[] args) {
		EventManagement event = new EventManagement();
		
		//참가자 명단에 인원 추가
		event.addParticipant("ABD");
		event.addParticipant("DAS");
		event.addParticipant("ERY");
		
		//대기열에 인원 추가
		event.addToWaitingQueue("SJH");
		event.addToWaitingQueue("KSJ");
		
		//참가자가 떠날 떄
		event.leaveParticipant("ABD");
		
		boolean  isABDParticipating = event.checkParticipant("ABD");
		boolean  isDASParticipating = event.checkParticipant("DAS");
		
		System.out.println(isABDParticipating);
		System.out.println(isDASParticipating);
	}

}
