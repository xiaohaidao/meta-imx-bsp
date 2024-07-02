SUMMARY = "The Linux Kernel"
SECTION = "xenomai4"
LICENSE = "GPL-2.0 & LGPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSES/preferred/GPL-2.0;md5=e6a75371ba4d16749254a51215d13f97 \
                    file://LICENSES/preferred/LGPL-2.0;md5=0e1dd121ad1021213d7de823991892f5 \
                    file://LICENSES/preferred/LGPL-2.1;md5=8c6e7513c570546f65ae570dae278c17 "

SRC_URI = "git://source.denx.de/Xenomai/xenomai4/linux-evl.git;protocol=https;branch=master;nobranch=1 \
           file://defconfig"

inherit kernel

# Modify these as desired
PV = "v6.6.15-evl2"
SRCREV = "f25ecf7ba6483115f4bff4bea7fe32a28bd7c572"

S = "${WORKDIR}/git"
