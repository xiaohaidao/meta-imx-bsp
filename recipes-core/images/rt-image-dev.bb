require rt-image.bb

IMAGE_FEATURES += "dev-pkgs"

# packages
IMAGE_INSTALL:append = " stress-ng"
