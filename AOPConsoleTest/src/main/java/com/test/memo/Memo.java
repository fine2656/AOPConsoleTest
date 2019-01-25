package com.test.memo;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Memo implements Imemo {

	@Override 	//주업무 - 메모 작성하기
	public void write(String memo) {
		System.out.println("메모 :"+memo);
		
	}

	@Override // 주업무 - 메모 수정하기
	public void edit(String memo) {
		String originMemo = "JAVA";
		System.out.println("메모 수정 전 : "+originMemo);
		originMemo=memo;
		System.out.println("메모 수정 후 : "+originMemo);
	}

	@Override // 주업무 - 메모 삭제하기
	public int del(int seq) {
		System.out.println(seq+" 번 메모삭제");
		return seq; // 삭제되어지 글 번호 넘기기
	}

	@Override
	public void read(int seq) throws Exception {
		if(seq <1) {
			throw new Exception("번호 오류"+seq);
		}
		System.out.println(seq+"번 메모 읽기");
		
	}

	
	
}
