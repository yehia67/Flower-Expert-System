# Java and CLIPS 

i am going to Give you step by step instructions on how to correctly import CLIBS in linux 

## Prerequisites
* download CLIPS_jni from [here](https://sourceforge.net/projects/clipsrules/files/CLIPS/6.30/clips_jni_050.zip/download).

* have Java JDK mine is openJDK8.1.

## Getting Started 
1. Extract zip file.
2. go the library-src Directory and open terminal from that directory 
3. here you are going to try running 
    ```
    make -f makefile.linux
    ```
    if No errors appeared you are good to go but most probably it won't iw will crash while making libCLIPSJNI.so  because your java environment variables an't setup correctly like mine :) so you have to follow the next steps.
    1. first you need to know the path of you JDK mine      is in.
        ```
        /usr/lib/jvm/java-8-openjdk-amd64/include
        ```
    2. next you are you going to open makefile.linux and replace the following 
        ```
        libCLIPSJNI.so : $(OBJS) net_sf_clipsrules_jni_Environment.c
	        gcc -o libCLIPSJNI.so -fPIC -shared -Wall -I$(JAVA_INCLUDE) -I$(JAVA_INCLUDE_OS) \
		    -lm $(OBJS) net_sf_clipsrules_jni_Environment.c
        ```
        with the following but remember add your path not mine.
        ```
        libCLIPSJNI.so : $(OBJS) net_sf_clipsrules_jni_Environment.c
	        gcc -o libCLIPSJNI.so -fPIC -shared -Wall -I /usr/lib/jvm/java-8-openjdk-amd64/include/linux -I/usr/lib/jvm/java-8-openjdk-amd64/include \
		    -lm $(OBJS) net_sf_clipsrules_jni_Environment.c
        ```
        as you have noticed already I added \linux in one of the paths the order isn't important
    3. then save and try execute the following command again 
        ```
        make -f makefile.linux
        ```
4. a file named libCLIPSJNI.so will be generated copy it and paste it in the root directory CLIPSJNI.

5. now in the root directory CLIPSJNI execute the following comand 
    ```
    maek -f makefile.linux
    ```
6. now copy the libCLIPSJNI.so to 
    * /usr/lib/jvm/java-8-openjdk-amd64/lib/amd64

    and to 
    * /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/amd64

7. copy the CLIPSJNI.jar in the root directory CLIPSJNI to 
    * /usr/lib/jvm/java-8-openjdk-amd64/lib

    and to 
    * /usr/lib/jvm/java-8-openjdk-amd64/jre/lib

## Finished
now you can clone this repo and try run the project and test if it works or not 

also you can run one of the demos using th follwoing command 
```
java -jar WineDemo.jar
```




