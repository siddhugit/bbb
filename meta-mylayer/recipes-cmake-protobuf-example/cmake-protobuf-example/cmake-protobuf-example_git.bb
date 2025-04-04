# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e2fc3a5bf9343c200a86e271c9bfa8d"

DEPENDS += "protobuf protobuf-native"

SRC_URI = "git://github.com/shaochuan/cmake-protobuf-example.git;protocol=https;branch=master \
           file://0001-creating-patch-to-install-target.patch \
           "

# Modify these as desired
PV = "1.0.0+git${SRCPV}"
SRCREV = "474da0cde17ceb92c499f21746ba402178e7d19b"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Protobuf
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = " \
-DYOCTO=1 \
-DCMAKE_PREFIX_PATH=${STAGING_DIR_TARGET}/usr/lib/cmake \
-DCMAKE_MODULE_PATH=${STAGING_LIBDIR}/cmake \
"

