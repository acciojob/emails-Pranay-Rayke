package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        int upper=0, lower=0, special = 0, number=0;
        int character = newPassword.length();
        if(this.password.equals(oldPassword))
        {
            for(int i=0;i<newPassword.length();i++)
            {
                char ch = newPassword.charAt(i);
                if(ch >= 'A' && ch<='Z') upper++;
                else if(ch>='a' && ch<='z') lower++;
                else if(ch>='0' && ch<= '9') number++;
                else special++;
            }
            if(character>=8 && upper >= 1 && lower >=1 && number >=1 && special >= 1)
            {
                this.password = newPassword;
                //System.out.println("Password changed successfully");
            }
//            else{
//                System.out.println("The New Passwrod Is Not Valid");
//            }
        }
//        else{
//            System.out.println("The given password dose not match with current password");
//        }

    }
}
