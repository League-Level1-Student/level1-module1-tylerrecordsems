package _05_vault;

public class JAM_BOND {
public int findCode(Vault v){
for (int i = 0; i < 1000000; i++) {
	if (v.trycode(i)) {
		return i;
	}
}	
return -1;
}
}
