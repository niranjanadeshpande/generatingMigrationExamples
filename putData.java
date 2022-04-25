public getConnection(){
  MongoDatabase sampleDB = mongoClient.getDatabase("libraryDB");
  return sampleDB;
}

public getData(){
  Document currentBook = new Document("_id", new ObjectId());
  currentBook.append("title:","Intro to Evolutionary Computing").append("author:","Eiben");
  return currentBook;
}

public putData(){
  Document entry = getData();
  MongoCollection<Document> bookCollection = getConnection().getCollection("books");
  bookCollection.insertOne(entry);
}
