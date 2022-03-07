package MiniMax;
 

 

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	BankAccount cust;
    @Before
    void object_creation(){
       cust= new BankAccount(21,9453839);
    }
    @Test
    void withdraw() {
        assertAll(
                ()-> assertThrows(InsufficientBalanceException.class,() -> cust.withdraw(9000000),"It is supposed to throw Insufficient funds exception"),
                ()-> assertThrows(InsufficientBalanceException.class,() -> cust.withdraw(983674748),"It is supposed to throw Insufficient funds exception")
        );
    }
}
