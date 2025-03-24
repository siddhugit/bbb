LICENSE = "CLOSED"

inherit useradd

PASSWD = "\$1\$wraOcZ9a\$yShWXXdsmFyaevmggqB8E/"
NEWUSER = "sid"

USERADD_PACKAGES = "${PN}"

USERADD_PARAM:${PN} = " -d/home/${NEWUSER} -p '${PASSWD}' ${NEWUSER}"

do_install () {
    install -d ${D}/home/${NEWUSER}
}

FILES:${PN} += "/home/${NEWUSER}"