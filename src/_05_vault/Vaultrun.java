package _05_vault;

import java.util.Random;

public class Vaultrun {
public static void main(String[] args) {
	Random ran = new Random();
	int code = ran.nextInt( 1000000);
	Vault v = new Vault(code);
	System.out.println(v.trycode(code));
	JAM_BOND jb = new JAM_BOND();
	System.out.println(jb.findCode(v)); 
}
}
