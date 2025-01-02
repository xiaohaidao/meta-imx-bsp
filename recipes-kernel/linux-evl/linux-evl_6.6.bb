SUMMARY = "The Linux Kernel"
SECTION = "xenomai4"
LICENSE = "GPL-2.0 & LGPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSES/preferred/GPL-2.0;md5=e6a75371ba4d16749254a51215d13f97 \
                    file://LICENSES/preferred/LGPL-2.0;md5=0e1dd121ad1021213d7de823991892f5 \
                    file://LICENSES/preferred/LGPL-2.1;md5=8c6e7513c570546f65ae570dae278c17 "

SRC_URI = "git://source.denx.de/Xenomai/xenomai4/linux-evl.git;protocol=https;branch=master;nobranch=1 \
           file://defconfig \
           file://0001-feat-add-ccbox-device-tree.patch \
           "

inherit kernel

# Modify these as desired
PV = "v6.6.37-evl3"
SRCREV = "44eaeec1d67df0b36f81e93bd3e09d1ba2693851"
PATCHTOOL = "git"

S = "${WORKDIR}/git"

#KERNEL_LOCALVERSION = "-evl2"
KBUILD_BUILD_VERSION = "1"
# CONFIG_LOCALVERSION_AUTO not set
# "noinitrd console=ttymxc0,115200 root=/dev/mmcblk3p7 coherent_pool=2M rootwait rw isolcpus=1 nohz=off"
