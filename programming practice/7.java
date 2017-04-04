package programming;

public class Account {
 private String owner;
 private long balance;
 
 public Account(){
	 super();
 }
 
 public Account(String owner) {
	 super();
	 this.owner = owner;
 }
 
 public Account(long balance){
	 super();
	 this.balance = balance;
 }
 
 public Account(String owner, long balance) {
	 super();
	 this.owner = owner;
	 this.balance = balance;
 }
 
 public String getOwner(){
	 return owner;
 }
 
public void setOwner(String owner) {
	this.owner = owner;
}

public long getBalance() {
	return balance;
}
public void setBalance(long balance){
	this.balance = balance;
}

public long deposit(long amount){
	long ba = this.balance + amount;
	this.balance =ba;
	System.out.println(amount+"입금확인\n 남은돈: "+ (int)ba);
	return ba;
}
public long withdrow(long amount){
	long ba = this.balance - amount;
	System.out.println(amount + "출금확인\n 남은돈: "+ (int)ba);
	this.balance = ba;
	return ba;
}
public static void main(String[] args){
	Account ac= new Account(200000);
	ac.withdrow(50000);
	ac.deposit(4500);
	ac.withdrow(30000);
	System.out.println(ac.getBalance());
}
}
