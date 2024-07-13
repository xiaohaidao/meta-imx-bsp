SUMMARY = ""
HOMEPAGE = ""
DESCRIPTION = ""
SECTION = ""

LICENSE = "GPL-2.0-only & LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
                    file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c \
                    "

SRC_URI = "gitsm://gitlab.com/etherlab.org/ethercat.git;protocol=https;branch=stable-1.6 \
           file://0001-fixed-fix-the-build-error.patch \
           "

# Modify these as desired
PV = "1.6+git"
SRCREV = "bc945f69ab6bde63a914988b9496919bedbc8e06"

S = "${WORKDIR}/git"


# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools pkgconfig module-base

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = "--with-linux-dir=${STAGING_KERNEL_BUILDDIR} \
                --with-module-dir=kernel/ethercat \
               "

# packages
FILES:${PN} += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}"
FILES:${PN} += "${prefix}/share/bash-completion/completions"
#FILES:${PN}-dev += "${libdir}/libethercat.so.1.2.0"

#PACKAGECONFIG ??= "generic"
#PACKAGECONFIG[generic] = "--enable-generic,--disable-generic,"
#PACKAGECONFIG[e1000]   = "--enable-e1000,--disable-e1000,"

RDEPENDS:${PN} += " bash"
#RDEPENDS:${PN}-dev += " ${PN}"


do_configure:append() {
    # fix build error
#    sed -i 's/\.\.\/master\///' ${S}/tool/Makefile.am
#    cp ${S}/master/globals.h ${S}/tool/
#    cp ${S}/master/soe_errors.c ${S}/tool/
}

do_compile:append() {
    oe_runmake modules
}

do_install:append() {
    oe_runmake MODLIB=${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION} modules_install
}
