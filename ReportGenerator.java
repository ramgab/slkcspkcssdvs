class ReportGenerator {
    private Database database;

    public ReportGenerator() {
        this.database = new Database();
    }

    public void generateMonthlyReport(int month, int year) {
        if (database.isConnected()) {
            // Получение данных
            List<Data> data = database.query("SELECT * FROM sales WHERE month=" + month + " AND year=" + year);

            // Создание отчета
            String report = "Report for " + month + "/" + year + "\n";
            for (Data d : data) {
                report += "Data: " + d.getInfo() + "\n";
            }

            // Печать отчета
            System.out.println(report);
        } else {
            System.out.println("Database not connected!");
        }
    }
}

class Database {
    public boolean isConnected() {
        // Предположим, здесь код для проверки подключения к базе данных
        return true;
    }

    public List<Data> query(String sql) {
        // Предположим, здесь код для выполнения SQL-запроса и возврата данных
        return new ArrayList<>();
    }
}

class Data {
    public String getInfo() {
        // Предположим, здесь код для получения информации из объекта данных
        return "some data";
    }
}
