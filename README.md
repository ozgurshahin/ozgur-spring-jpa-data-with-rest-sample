**Save**:\
'curl -i -H "Content-Type:application/json" -d '{"name": "Book_fromRest"}' http://localhost:8080/book'

**List**:\
'curl http://localhost:8080/book'

**List an element**:\
'curl http://localhost:8080/book/ROW_ID'

**List custom queries**:\
'curl http://localhost:8080/book/search'

**Use Find query**:\
'curl http://localhost:8080/book/search/findByName?name=Book_fromRest'

**Update Row (empty fields will be set as NULL)**:\
'curl -X PUT -H "Content-Type:application/json" -d '{"name": "Updated_Name"}' http://localhost:8080/book/ROW_ID'


**Update Row (empty fields will be changed)**:\
'curl -X PATCH -H "Content-Type:application/json" -d '{"name": "Updated_Name"}' http://localhost:8080/book/ROW_ID'


**Delete row**:\
'curl -X DELETE http://localhost:8080/book/ROW_ID'
