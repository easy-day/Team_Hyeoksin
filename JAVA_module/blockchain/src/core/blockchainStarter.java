package core;

import util.Util;

public class blockchainStarter {

	 public static void main(String[] args) {

		   //System.out.println(Util.getHash(""));

		    block block1 = new block(1, null, 0, "������");
		    block1.mine();
		    block1.getInformation();

		    

		    block block2 = new block(2, block1.getBlockHash(), 0, "������");
		    block2.mine();
		    block2.getInformation();

		    

		    block block3 = new block(3, block2.getBlockHash(), 0, "������");
		    block3.mine();
		    block3.getInformation();



		    block block4 = new block(4, block3.getBlockHash(), 0, "������");
		    block4.mine();
		    block4.getInformation();
		  }
		}