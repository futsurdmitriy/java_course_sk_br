<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<script>
    var request;
    async function sendInfo(id) {
        var url = "http://localhost:8080/web/cafedra/info/" + id;
        const response = await fetch(url);
        const jsonBody = await response.json();
        document.getElementById("name").innerHTML = jsonBody.name;
        document.getElementById("desc").innerHTML = jsonBody.desc;
        document.getElementById("cheif").innerHTML = jsonBody.chief;
        document.getElementById("created_at").innerHTML = jsonBody.createdAt;
        document.getElementById("modified").innerHTML = jsonBody.modified;
    }
</script>
<h1>Hello Frontend</h1>
    <div>
        <div style="text-align: right">
            Create test records
            <a class="btn-info" href="http://localhost:8080/web/cafedra/refresh">
                Rollback</a>
        </div>
        <#--<form name="vinform">
            <input type="text" name="t1">
            <input type="button" value="ShowTable" onClick="sendInfo()">
        </form>-->
        <table class="table table-striped table-dark">
            <tr>
                <th>Number</th>
                <th>Name</th>
                <th>Description </th>
                <th>Chief</th>
                <th>Action</th>
            </tr>
            <#list list as item>
                <tr>
                    <td>${item?counter}</td>
                    <td>${item.name}</td>
                    <td>${item.desc}</td>
                    <td>${item.chief}</td>
                    <td>
                        <a href="http://localhost:8080/web/cafedra/delete/${item.id}">
                            <input type="button" value="delete" class="btn-danger">
                        </a>
                        <a href="http://localhost:8080/web/cafedra/update/${item.id}">
                            <input type="button" value="update" class="btn-warning">
                        </a>
                        <input type="button" value="info" class="btn-info" onclick="sendInfo('${item.id}')" />
<#--                        <input type="button" value="update" class="btn-warning"/>-->
                    </td>
                </tr>
            </#list>
        </table>
        <br>
        <br>
        <div>
            <h2>Object info</h2>
            <table class="table">
                <tr>
                    <th>Name</th>
                    <th>Description </th>
                    <th>Chief</th>
                    <th>Created At</th>
                    <th>Modified</th>
                </tr>
                <tr>
                    <td id="name"></td>
                    <td id="desc"></td>
                    <td id="cheif"></td>
                    <td id="created_at"></td>
                    <td id="modified"></td>
                </tr>
            </table>

        </div>
       <#-- <form>
            <input type="text" name="name" placeholder="name"><br>
            <input type="text" name="description" placeholder="description"><br>
            <input type="text" name="chief" placeholder="chief"><br>
            <input type="submit" value="Create">
        </form>-->
    </div>
</body>
</html>