#@TYPE: Machine
#@NAME: imx6q-sabrelite machine
#@DESCRIPTION: Machine configuration for running an ARMv7 system on imx6q-sabrelite

require conf/machine/include/arm/armv7a/tune-cortexa9.inc

# uboot
# UBOOT_MACHINE ?= "imx_v6_v7_defconfig"

# IMAGE_BOOT_FILES ?= "u-boot.${UBOOT_SUFFIX} ${SPL_BINARY} ${KERNEL_IMAGETYPE} ${KERNEL_DEVICETREE}"

# ${KERNEL_PACKAGE_NAME}

# extlinux
UBOOT_EXTLINUX = "1"
# UBOOT_EXTLINUX_LABELS ??= "default fallback"
UBOOT_EXTLINUX_DEFAULT_LABEL ??= "Linux Default"
# UBOOT_EXTLINUX_TIMEOUT ??= "3"
UBOOT_EXTLINUX_KERNEL_IMAGE:default ??= "../zImage"
UBOOT_EXTLINUX_MENU_DESCRIPTION:default ??= "Linux Default"
# UBOOT_EXTLINUX_KERNEL_IMAGE:fallback ??= "../zImage-fallback"
# UBOOT_EXTLINUX_MENU_DESCRIPTION:fallback ??= "Linux Fallback"

# UBOOT_EXTLINUX_ROOT = "root=/dev/mmcblk3p1"
# UBOOT_EXTLINUX_FDT = "../imx6q-sabresd-ccbox.dtb"
UBOOT_EXTLINUX_CONSOLE = "console=ttymxc0;115200" 
UBOOT_EXTLINUX_KERNEL_ARGS:append = " isolcpus=1 nohz_full=1"

# kernel
KERNEL_DEVICETREE ?= "nxp/imx/imx6q-sabrelite.dtb \
                      nxp/imx/imx6q-sabresd-ccbox.dtb \
                      "
MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "kernel-image \
                                     kernel-devicetree \
                                     u-boot-extlinux \
                                     "

# image
SERIAL_CONSOLES ?= "115200;ttymxc0"

IMAGE_FSTYPES += "tar.bz2 ext4"

# poky setting
# DISTRO = "poky"
DISTRO_NAME = "Poky Realtime"

# image
# INIT_MANAGER ?= "sysvinit"

# packages
PACKAGE_CLASSES = "package_ipk"

# kernel
PREFERRED_PROVIDER_virtual/kernel ?= "linux-evl"
PREFERRED_PROVIDER_virtual/bootloader ?= "u-boot"

# don't install bootloader
# EXTRA_IMAGEDEPENDS += "virtual/bootloader"
