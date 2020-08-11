<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<#--<script>-->
<#--    var request;-->
<#--    function sendInfo()-->
<#--    {-->
<#--        var v=document.vinform.t1.value;-->
<#--        var url="http://localhost:8080/web/cafedra/info/"+v;-->

<#--        if(window.XMLHttpRequest){-->
<#--            request=new XMLHttpRequest();-->
<#--        }-->
<#--        else if(window.ActiveXObject){-->
<#--            request=new ActiveXObject("Microsoft.XMLHTTP");-->
<#--        }-->

<#--        try-->
<#--        {-->
<#--            request.onreadystatechange=getInfo;-->
<#--            request.open("GET",url,true);-->
<#--            request.send();-->
<#--        }-->
<#--        catch(e)-->
<#--        {-->
<#--            alert("Unable to connect to server");-->
<#--        }-->
<#--    }-->

<#--    function getInfo(){-->
<#--        if(request.readyState==4){-->
<#--            var val=request.responseText;-->
<#--            document.getElementById('amit').innerHTML=val;-->
<#--        }-->
<#--    }-->

<#--</script>-->
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
            </tr>
            <#list list as item>
                <tr>
                    <td>${item?counter}</td>
                    <td>${item.name}</td>
                    <td>${item.desc}</td>
                    <td>${item.chief}</td>
                    <td><a href="http://localhost:8080/web/cafedra/delete/${item.id}">
                            <input type="button" value="delete" class="btn-danger">
                        </a> </td>
                </tr>
            </#list>
        </table>
        <br>
        <form>
            <input type="text" name="name" placeholder="name"><br>
            <input type="text" name="description" placeholder="description"><br>
            <input type="text" name="chief" placeholder="chief"><br>
            <input type="submit" value="Create">
        </form>
    </div>
</body>
</html>