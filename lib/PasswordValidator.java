package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password ที่ต้องการตรวจสอบ
     * @return ค่าความแข็งแรงของ password
     */ 
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) {
        
        
        int minLength = 8 ; 
        
        if (password==null || password.length() < minLength) {
            return PasswordStrength.INVALID;
        }
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        
        for(int i = 0 ; i< password.length() ; i++) {
            char c = password.charAt(i);
            if(Character.isDigit(c)){
                hasDigit = true;
            }
            else if(Character.isUpperCase(c)){
                hasUpper = true;
            }
            else if(Character.isLowerCase(c)){
                hasLower = true;
            }
            else if(!Character.isLetterOrDigit(c)){
                hasSpecial = true;
            }
        }
        if(hasDigit&&hasUpper&&hasLower&&hasSpecial){
            return PasswordStrength.STRONG;
        }else if(hasDigit && hasLower&&hasUpper){
            return PasswordStrength.MEDIUM;
        }else{
            return PasswordStrength.WEAK;
        }
    }
 }