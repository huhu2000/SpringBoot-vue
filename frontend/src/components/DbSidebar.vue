<template>
   <ul>
    <li v-for="item in menuList" class="el-menu-item is-active" style="">{{item.msg}}</li>
   
   </ul>
</template>

<script>

    export default {
        name: 'db-sidebar',
        data() {
          
           /* return {
                msg: '测试1',
                msg1: '测试',
            }*/
            return {  menuList: "" }
        },
        mounted (){
             
           
               
                const idurl = 'http://localhost:8000/api/persons/menu';
                this.$axios.get(idurl).then((response) => {
                     //alert(response.data);
                     this.menuList = response.data;
                 
                }).catch(function (response) {
                    console.log(response)
                });
        }

    }

</script>

<style>
    li {
        padding-left: 20px;
    }
</style>
