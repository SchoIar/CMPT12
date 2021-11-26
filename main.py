import discord
from discord.ext import commands

client = commands.Bot(command_prefix=",", case_insensitive=True, self_bot=True)

# to use it just type ",leave" anywhere and it'll leave the groups
# if ur struggling dm me on cord alf#9999

token = "put your token here"

@client.event
async def on_ready():
    print(f"Logged in as {client.user}")

@client.command()
async def leave(ctx):
    for _ in client.private_channels:
        if isinstance(_, discord.GroupChannel):
            try:
                print(f"left {_}")
                await _.leave()
            except Exception as e:
                print(e)
    print("ogusers.com/alf")

client.run(token, bot=False)
