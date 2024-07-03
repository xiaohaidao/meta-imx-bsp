SUMMARY = ""
HOMEPAGE = ""
DESCRIPTION = ""
SECTION = ""

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2500c28da9dacbee31a3f4d4f69b74d0"

SRC_URI = "git://source.denx.de/Xenomai/xenomai4/libevl.git;protocol=https;branch=master \
           file://0001-fixed-fixed-error-when-gcc-buildingwq.patch \
           "

# Modify these as desired
PV = "r47+git"
SRCREV = "3bbe1d092e021113b1aa238c7a51c8f634c6cdcc"

S = "${WORKDIR}/git"

inherit meson
DEPENDS += "linux-evl"

# build flags
QEMU_OPTIONS += " -B 0x10000"
EXTRA_OEMESON = "-Duapi=${STAGING_KERNEL_DIR}"

# tests package
PACKAGES += "${PN}-test"
FILES:${PN}-test = "${prefix}/tests"
