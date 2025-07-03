package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านน้อยกว่า8ตัว
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is invaild");
        } else {
            System.out.println("Test Case 1 FAILED: Expected Weak but got " + result1);
        }
        // Test Case 2 : รหัสผ่านใส่ได้แค่ตัวเลขหรือตัวอักษรมากกว่าเท่า8ตัว
        PasswordStrength result2 = PasswordValidator.validate("aaaaaaaa");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Weak password is INVALID.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected Weak but got " + result2);
        }
        // Test Case 3 : รหัสผ่านต้องมีทั้งตัวเลขและตักอักษรพิมพ์เล็กพิมพ์ใหญ่ตัวอักษรมากกว่าเท่า8ตัว
        PasswordStrength result3 = PasswordValidator.validate("444wAtcara");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: MEDIUM password is INVALID.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected Medium but got " + result3);
        }
        // Test Case 4 : รหัสผ่านต้องมีทั้งตัวเลขและตักอักษรพิมพ์เล็กพิมพ์ใหญ่และอักษรพิเศษตัวอักษรมากกว่าเท่า8ตัว
        PasswordStrength result4 = PasswordValidator.validate("Watchara123@");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: STRONG password is INVALID.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected STRONG but got " + result4);
        }

        System.out.println("--------------------------------");
    }
}