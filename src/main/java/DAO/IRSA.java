package DAO;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

//interface implementation
public interface IRSA extends Serializable{

  
    //@param message to be encrypted
     //* @return encrypted message represented by a Java BigInteger
    BigInteger encrypt(BigInteger bigInteger);

    /*
     * @param message string
     * @return a list of encrypted message blocks where each encrypted block is represented by a Java BigInteger
     */
    List<BigInteger> encryptMessage(final String message);

    
     //@param filePath path to a file containing the message to be encripted
     //@return a BigInteger representing each encrypted file line
     
    List<BigInteger> encryptFile(String filePath);

    
     //* @param encrypted encrypted message
     //* @return decrypted message represented by a Java BigInteger type
     
    BigInteger decrypt(BigInteger encrypted);

    
     //* @param encryption encrypted messages represented by a list of Java BigInteger
     //* @return list of decrypted message
  
    List<BigInteger> decrypt(List<BigInteger> encryption);

    
    
     //* @param message to be digitally signed
     //* @return signed message represented by a Java BigInteger
   
    BigInteger sign(BigInteger bigInteger);

  
    List<BigInteger> signMessage(final String message);

    
    //each line of a file using the sign method
    List<BigInteger> signFile(String filePath);

    BigInteger Verify(BigInteger signedMessage);

    
    List<BigInteger> verify(List<BigInteger> signedMessages);

   //boolean flag for verification
    boolean isVerified(BigInteger signedMessage, BigInteger message);
    
   
     //@return decimal representation of the message
  
    List<BigInteger> messageToDecimal(final String message);
            
   
     // @return decimal representation of a file
     
    List<BigInteger> fileToDecimal(final String filePath);

 
	BigInteger encrypt(BigInteger bigInteger, BigInteger _e, BigInteger _n);

	BigInteger decrypt(BigInteger encrypted, BigInteger _d, BigInteger _n);
}
