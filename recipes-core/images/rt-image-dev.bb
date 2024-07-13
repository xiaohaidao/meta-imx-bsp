require rt-image.bb

IMAGE_FEATURES += "dev-pkgs \
                   tools-debug \
                  "

# packages
IMAGE_INSTALL:append = " stress-ng \
                         expect \
                       "
