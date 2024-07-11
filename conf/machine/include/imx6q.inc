#@TYPE: Machine
#@NAME: imx6q-sabrelite machine
#@DESCRIPTION: Machine configuration for running an ARMv7 system on imx6q-sabrelite

require conf/machine/include/arm/armv7a/tune-cortexa9.inc

# uboot
# UBOOT_MACHINE ?= "imx_v6_v7_defconfig"

# kernel
KERNEL_DEVICETREE ?= "nxp/imx/imx6q-sabrelite.dtb \
                      nxp/imx/imx6q-sabresd-ccbox.dtb \
                      "

KERNEL_IMAGETYPE ?= "zImage"

SERIAL_CONSOLES ?= "115200;ttymxc0"

IMAGE_FSTYPES += "tar.bz2 ext4"

