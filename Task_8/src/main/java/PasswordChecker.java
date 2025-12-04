public class PasswordChecker {

    private Integer minLength = null;
    private Integer maxRepeats = null;

    public void setMinLength(int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("Минимальная длина не может быть отрицательной!");
        }
        this.minLength = minLength;
    }

    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException("Количество повторов должно быть положительным и больше 0!");
        }
        this.maxRepeats = maxRepeats;
    }

    public boolean verify(String password) {
        if (minLength == null || maxRepeats == null) {
            throw new IllegalStateException("Параметры проверки не установлены!");
        }

        // Проверка длины
        if (password.length() < minLength) {
            return false;
        }

        // Проверка повторов подряд
        int count = 1;
        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                count++;
                if (count > maxRepeats) {
                    return false;
                }
            } else {
                count = 1;
            }
        }

        return true;
    }
}


