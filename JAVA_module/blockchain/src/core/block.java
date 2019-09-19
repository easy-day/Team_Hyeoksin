package core;

import util.Util;

public class block {

	 private int blockID;

	  private String previousBlockHash;

	  private int nonce;

	  private String data;



	  public int getBlockID() {
	    return blockID;
	  }

	  public void setBlockID(int blockID) {
	    this.blockID = blockID;
	  }

	  public String getPreviousBlockHash() {
	    return previousBlockHash;
	  }

	  public void setPreviousBlockHash(String previousBlockHash) {
	    this.previousBlockHash = previousBlockHash;
	  }

	  public int getNonce() {
	    return nonce;
	  }

	  public void setNonce(int nonce) {
	    this.nonce = nonce;
	  }

	  public String getData() {
	    return data;
	  }

	  public void setData(String data) {
	    this.data = data;
	  }

	  public block(int blockID, String previousBlockHash, int nonce, String data) {
	    this.blockID = blockID;
	    this.previousBlockHash = previousBlockHash;
	    this.nonce = nonce;
	    this.data = data;
	  }

	  public void getInformation() {

	    System.out.println("--------------------------------------");

	    System.out.println("��� ��ȣ: " + getBlockID());

	    System.out.println("���� �ؽ�: " + getPreviousBlockHash());

	    System.out.println("ä�� ���� ��: " + getNonce());

	    System.out.println("��� ������: " + getData());

	    System.out.println("��� �ؽ�: " + getBlockHash());

	    System.out.println("--------------------------------------");

	  }

	  public String getBlockHash() {
	    return Util.getHash(nonce + data + previousBlockHash);
	  }

	  public void mine() {

	    while(true) {

	      if(getBlockHash().substring(0, 3).equals("000")) {
	        System.out.println(blockID + "��° ����� ä���� �����߽��ϴ�.");
	        break;
	      }

	      nonce++;
	    }
	  }
	}
