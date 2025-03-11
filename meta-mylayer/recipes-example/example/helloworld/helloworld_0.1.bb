SUMMARY = "Hello World program"
DESCRIPTION = "Hello World program"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI="file://helloworld.c"

S = "${WORKDIR}/build"

do_compile(){
    #${CC} ${CFLAGS} ${LDFLAGS} ${WORKDIR}/helloworld.c ${S}/helloworld
}

do_install(){
    install -d ${D}/${bindir}
    install -m 755 ${S}/helloworld ${D}/${bindir}/helloworld
}
