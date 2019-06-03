# SmartRefreshLayout
```
    申明：项目来自于 https://github.com/scwang90/SmartRefreshLayout
    因为在接入mpaas框架中使用的时候，编译出现乱码，导致项目无法运行
    才对SmpartRefreshLayout重新打包编译，生成依赖，删除在SmpartRefreshLayout中的部分注释和代码
    是mpaas框架能顺利运行。

```
## 在项目的builder.gradle中
```
allprojects {
	repositories {
			...
		maven { url 'https://jitpack.io' }
	}
}
```
在module的builder.gradle中
```
    dependencies {
	    implementation 'com.github.flyingtercel:SmartRefreshLayout:Tag'
    }
```