public getConnection(){
  Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/libraryDB");
  return conn;
}

public getData(connect){
  String query = "Insert into books VALUES ('Intro to Evolutionary Computing', 'Eiben')";
  return query;
}

public putData(){
  Connection connect = getConnection();
  Statement stmt = (Statement) connect.createStatement();
  String entry = getData(connect);
  stmt.executeUpdate(entry);
}
